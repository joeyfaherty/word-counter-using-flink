# word-counter-using-flink

This example reads text from a socket and once every 5 seconds print the number of occurrences of each distinct word during the previous 5 seconds, i.e. a tumbling window of processing time, as long as words are floating in.

1. Download and install flink from http://flink.apache.org/downloads.html

2. ./bin/start-local.sh (starts the job manager at http://localhost:8081/#/overview )

3. nc -l 9991 (we use netcat to start a local server listening on port 9991)

4. ./bin/flink run examples/streaming/SocketWindowWordCount.jar --port 9991 (submits the flink program and connects it to the socket 9991 and waits for input )

5. http://localhost:8081/#/overview (verify your job is running via the job manager)

6. nc -l 9991
input some text
input anything!
each window of 5 seconds is parsed

7. tail -f log/flink-*-jobmanager-*.out
input : 2
parsed : 1
is : 1
seconds : 1
5 : 1
of : 1
window : 1
each : 1
anything! : 1
text : 1
some : 1

8. ./bin/stop-local.sh (stop flink when you are done)

https://ci.apache.org/projects/flink/flink-docs-release-1.2/quickstart/setup_quickstart.html




