# OpsSight Phase 0 Foundation

## Goal

Phase 0 establishes the backend and data foundation of OpsSight.

This phase focuses on:
- service boundaries
- repository structure
- Spring Boot service skeletons
- PostgreSQL foundation
- Flyway migration discipline
- Docker-friendly local setup
- Swagger/OpenAPI visibility
- Actuator health visibility
- future event-driven contract direction

## Service Boundaries

### gateway-service
Entry and system-facing service.
Phase 0 scope:
- Spring Boot skeleton
- ping endpoint
- actuator
- swagger

### case-service
Command-side business domain owner for Case.
Phase 0 scope:
- Spring Boot skeleton
- PostgreSQL connection
- Flyway migration
- initial transactional schema
- ping endpoint
- actuator
- swagger

### projection-service
Read-side / projection boundary.
Phase 0 scope:
- Spring Boot skeleton
- ping endpoint
- actuator
- swagger

### ai-insight-service
AI augmentation boundary.
Phase 0 scope:
- Spring Boot skeleton
- ping endpoint
- actuator
- swagger

## Repo Strategy

Project uses:
- monorepo structure
- independent service folders under `backend/`
- separate `contracts/`, `docs/`, `infra/`, `frontend/`, `scripts/`

## Data Foundation

Phase 0 transactional schema is owned by `case-service`.

Implemented foundation:
- `cases`
- `case_history`
- `case_comments`

Design decisions:
- transactional write model stays separate from projection/read model
- migration is handled by Flyway
- schema generation is NOT delegated to Hibernate
- Docker PostgreSQL is used for consistent local setup

## Docker Foundation

Current Phase 0 Docker setup includes:
- PostgreSQL 16 container
- named volume for persistence
- host port mapping on `5543`

## Event Direction

Phase 0 does NOT implement:
- real Kafka publishing
- outbox flow
- projection consumers
- alert engine
- AI insight generation

Phase 0 DOES define:
- event envelope direction
- event type naming catalog
- outbox-compatible future direction
- traceability/idempotency-oriented metadata expectations

## Out of Scope

The following are intentionally excluded from Phase 0:
- full CRUD and lifecycle flow
- JWT/RBAC implementation
- real Kafka producer/consumer flows
- projection logic
- dashboard metrics
- AI inference or local model integration
- production hardening

## Phase 0 Result

At the end of Phase 0:
- all core backend service skeletons exist
- backend structure is clean and modular
- case-service data foundation is running
- local PostgreSQL works through Docker Compose
- service visibility exists through Swagger and Actuator
- future event-driven evolution has a documented contract direction
