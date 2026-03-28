# OpsSight

OpsSight is a portfolio-grade, AI-augmented, event-driven operations intelligence platform.

## Phase 0 Status

Phase 0 establishes the backend and data foundation.

Completed in Phase 0:
- repository and folder structure
- backend service skeletons
- gateway-service foundation
- case-service foundation
- projection-service foundation
- ai-insight-service foundation
- PostgreSQL Docker Compose setup
- Flyway migration foundation
- Swagger/OpenAPI exposure
- Actuator health exposure
- event envelope contract direction
- event type catalog
- architecture foundation documentation

## Services

- `gateway-service` -> entry/system-facing service
- `case-service` -> command-side domain owner
- `projection-service` -> read-side/projection boundary
- `ai-insight-service` -> AI augmentation boundary

## Local Infrastructure

Current Docker Compose foundation:
- PostgreSQL 16

Default Docker PostgreSQL connection:
- host: `localhost`
- port: `5543`
- database: `opssight_case_db`
- username: `postgres`
- password: `postgres`

## Important Phase 0 Note

Phase 0 intentionally does NOT include:
- full CRUD/business workflows
- Kafka publishing/consuming
- outbox implementation
- projection logic
- AI insight generation
- JWT/RBAC implementation

## Next Direction

Later phases will add:
- real case lifecycle flows
- event publishing
- projection updates
- analytics/dashboard logic
- AI augmentation behavior
