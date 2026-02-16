**Singleton Design Pattern**

- Eager Initialization: simple, thread-safe but always created, not preferred for heavy objects
- Lazy Initialization: created on first access, not thread-safe
- Thread-safe synchronized: solves concurrency but costly
- Double-checked locking: lazy + thread-safe, complex
- Static Inner Class (Initialization-on-Demand Holder): lazy, thread-safe, simple ✅ preferred
- Enum Singleton: thread-safe, reflection & serialization safe, effectively eager, suitable for lightweight infra/util objects
- Senior tip: use static-holder for app-level lazy singletons; enum for safe infra singletons; avoid double-checked locking