#!/bin/bash

echo Running $(basename -- "$0")

## variables
SOAP_USER='soap'
SOAP_PASSWORD='123'
HOST_PORT=localhost:8080
AUTENTICATION=${SOAP_USER}:${SOAP_PASSWORD}

## call SOAP passing user and soap request
curl -s -i \
    -H "Content-Type: text/xml; charset=utf-8" \
    -H "SOAPAction:" \
    -d @soap_request.xml \
    -X POST http://${AUTENTICATION}@${HOST_PORT}/demo/CalculatorWS