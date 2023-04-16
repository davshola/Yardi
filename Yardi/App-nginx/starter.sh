#!/bin/bash
/usr/sbin/nginx -g "daemon off;" &
java -jar spring-site-0.0.1-SNAPSHOT.jar &
wait -n
exit $7