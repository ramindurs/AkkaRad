# Akka R&D
A simple project based on the book __Akka In Action__ to demonstrate Akka Actors, Stream and HTTP.

## REST API
The following table shows the REST API:

Description  | HTTP Method  | URL           | Request Body              | Status Code   | Response
-------------|--------------|---------------|---------------------------|---------------|---------
Create event    | POST         |/event/{event} | { "tickets": 250 }        | 201           | {"name": "event", "tickets": 250 }
Get all events | GET | /events | N/A | 200 | [ { "event" : "event", "tickets": 249 } ... ]
Buy tickets | POST | /events/{event}/tickets | { "tickets" : 2 } | 201 | { "event" : "event", "entries" : [ { "id" : 1 }...]}
Cancel an event | DELETE | /events/{event} | N/A | 200 | { "event": "event" , "tickets": 249 }         