# OpsSight Event Envelope v1

## Purpose

This document defines the standard event envelope for OpsSight.

Phase 0 decision:
- Event-driven architecture direction is preserved.
- Full event publishing flow is NOT implemented yet.
- This envelope exists to standardize future producers and consumers.

## Envelope Fields

Every event must include:

- `event_id`
- `event_type`
- `event_version`
- `occurred_at`
- `aggregate_type`
- `aggregate_id`
- `payload`
- `metadata`

## Metadata Fields

`metadata` must include:

- `correlation_id`
- `causation_id`
- `idempotency_key`
- `actor_id`
- `actor_role`
- `source_service`

## Canonical JSON Shape

```json
{
  "event_id": "uuid",
  "event_type": "case.created",
  "event_version": 1,
  "occurred_at": "2026-03-28T10:00:00Z",
  "aggregate_type": "case",
  "aggregate_id": "uuid",
  "payload": {},
  "metadata": {
    "correlation_id": "uuid",
    "causation_id": "uuid",
    "idempotency_key": "string",
    "actor_id": "uuid",
    "actor_role": "ROLE_MANAGER",
    "source_service": "case-service"
  }
}
Field Notes
event_id

Unique identifier of the event itself.

event_type

Business event name such as case.created, case.assigned, insight.generated.

event_version

Version number of the event contract.

occurred_at

UTC timestamp indicating when the event happened.

aggregate_type

Business aggregate type. In Phase 0, expected primary value is case.

aggregate_id

Identifier of the aggregate instance related to the event.

payload

Business event data. Payload shape will vary by event type.

metadata.correlation_id

Used to trace related actions across services.

metadata.causation_id

Points to the event or command that caused this event.

metadata.idempotency_key

Supports safe retry and duplicate protection direction.

metadata.actor_id

Identifier of the user/system actor that triggered the event.

metadata.actor_role

Role of the actor such as ROLE_ANALYST, ROLE_MANAGER, ROLE_ADMIN.

metadata.source_service

Service that produced the event.

Phase 0 Scope Notes

In Phase 0:

this envelope is documentation and contract direction
event broker publishing is not implemented
outbox is not fully implemented
projection consumption is not implemented
Future Compatibility Notes

This envelope is designed to support:

outbox pattern
projection-service consumers
ai-insight-service enrichment flows
traceability and auditability
idempotent message handling
