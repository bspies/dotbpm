# DotBPM Language
DotBPM is a language for describing workflows. 

## Structure
* Process
```text
process ID {
  pool* | lane* | statements
}
```
* Pools
```text
(( lane* ))
```
* Lanes
```text
|[ statement* ]|
```

## Elements

### Core
Symbol | Type
-------|---------
`[]`   | Activity
`<>`   | Gateway
`()`   | Event
`{}`   | Group
`#`    | Link

### Flows
Symbol | Type
-------|---------
`==>`  | Sequence
`-->`  | Message
`--`   | Association

### Events
Symbol | Event
-------|------
`(>)`  | Start 
`(/)`  | End
`(-)`  | Terminate
`(X)`  | Cancel
`(<<)` | Compensation
`(~)`  | Error
`(@)`  | Message
`(!)`  | Signal
`(..)` | Timer
`(?)`  | Condition
`(^)`  | Escalation
`(*)`  | Multiple
`(+)`  | Multiple Parallel
`(_)`  | None

### Gateways
Symbol | Gateway
-------|--------
`<XOR>`| Exclusive (XOR)
`<OR>` | Inclusive (OR)
`<AND>`| Parallel (AND)
`<*>`  | Complex
`<()>` | Event-Based