package net.javacrumbs.shedlock.provider.inmemory;

import net.javacrumbs.shedlock.core.AbstractSimpleLock;
import net.javacrumbs.shedlock.core.ExtensibleLockProvider;
import net.javacrumbs.shedlock.core.LockConfiguration;
import net.javacrumbs.shedlock.core.SimpleLock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static net.javacrumbs.shedlock.core.ClockProvider.now;

/**
 * In memory lock that is suitable only for tests and running application locally.
*/
public class InMemoryLockProvider implements ExtensibleLockProvider {
    private final Map<String, LockRecord> locks = new HashMap<>();

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public Optional<SimpleLock> lock(LockConfiguration lockConfiguration) {
        synchronized (locks) {
            String lockName = lockConfiguration.getName();
            if (isLocked(lockName)) {
                return Optional.empty();
            } else {
                LockRecord lockRecord = new LockRecord(lockConfiguration.getLockAtMostUntil());
                locks.put(lockName, lockRecord);
                logger.debug("Locked {}",  lockConfiguration);
                return Optional.of(new InMemoryLock(lockConfiguration));
            }
        }
    }

    boolean isLocked(String lockName) {
        synchronized (locks) {
            LockRecord lockRecord = locks.get(lockName);
            return lockRecord != null && lockRecord.lockedUntil.isAfter(now());
        }
    }

    private void doUnlock(LockConfiguration lockConfiguration) {
        synchronized (locks) {
           locks.put(lockConfiguration.getName(), new LockRecord(lockConfiguration.getLockAtLeastUntil()));
            logger.debug("Unlocked {}", lockConfiguration);
        }
    }

    private Optional<SimpleLock> doExtend(LockConfiguration newConfiguration) {
        synchronized (locks) {
            String lockName = newConfiguration.getName();
            if (isLocked(lockName)) {
                locks.put(lockName, new LockRecord(newConfiguration.getLockAtMostUntil()));
                logger.debug("Extended {}", newConfiguration);
                return Optional.of(new InMemoryLock(newConfiguration));
            } else {
                return Optional.empty();
            }
        }
    }

    private record LockRecord(Instant lockedUntil) {
    }

    private class InMemoryLock extends AbstractSimpleLock {

        private InMemoryLock(LockConfiguration lockConfiguration) {
            super(lockConfiguration);
        }

        @Override
        protected void doUnlock() {
            InMemoryLockProvider.this.doUnlock(lockConfiguration);
        }

        @Override
        protected Optional<SimpleLock> doExtend(LockConfiguration newConfiguration) {
            return InMemoryLockProvider.this.doExtend(newConfiguration);
        }
    }
}
