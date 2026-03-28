# OpsSight Event Types

## Purpose

This document defines the initial event type catalog for OpsSight.

Phase 0 decision:
- Event names are reserved and standardized now.
- Event publishing and consumption will be implemented in later phases.

## Core Case Events

- `case.created`
- `case.triaged`
- `case.assigned`
- `case.reassigned`
- `case.started`
- `case.blocked`
- `case.waiting_external`
- `case.escalated`
- `case.resolved`
- `case.closed`
- `case.failed`
- `case.commented`

## Alert Events

- `alert.triggered`
- `alert.resolved`

## Insight Events

- `insight.generated`

## Naming Rules

- Use lowercase
- Use dot-separated business naming
- Use past-tense business events where appropriate
- Keep names domain-oriented, not technical

## Examples

Good:
- `case.created`
- `case.assigned`
- `insight.generated`

Avoid:
- `createCaseEvent`
- `CASE_CREATED`
- `case-service-published-event`

## Phase 0 Notes

This catalog exists to:
- preserve naming consistency
- prevent future event drift
- support future producer/consumer contracts
