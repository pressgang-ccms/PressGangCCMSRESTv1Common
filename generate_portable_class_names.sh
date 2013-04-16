#!/bin/bash

# A script to output the classes that need to be listed in ErraiApp.properties

JAVA_EXTENSION=".java"
BASE_PATH=/home/matthew/git/PressGangCCMSRESTv1Common/src/main/java/
COLLECTIONS=${BASE_PATH}org/jboss/pressgang/ccms/rest/v1/collections/*
COLLECTIONS_ITEMS=${BASE_PATH}org/jboss/pressgang/ccms/rest/v1/collections/items/*
COLLECTIONS_ITEMS_JOIN=${BASE_PATH}org/jboss/pressgang/ccms/rest/v1/collections/items/join/*
COLLECTIONS_JOIN=${BASE_PATH}org/jboss/pressgang/ccms/rest/v1/collections/join/*
COLLECTIONS_CONTENTSPEC=${BASE_PATH}org/jboss/pressgang/ccms/rest/v1/collections/contentspec/*
ENTITIES=${BASE_PATH}org/jboss/pressgang/ccms/rest/v1/entities/*
ENTITIES_CONTENTSPEC=${BASE_PATH}org/jboss/pressgang/ccms/rest/v1/entities/contentspec/*
ENTITIES_ENUMS=${BASE_PATH}org/jboss/pressgang/ccms/rest/v1/entities/enums/*
ENTITIES_JOIN=${BASE_PATH}org/jboss/pressgang/ccms/rest/v1/entities/join/*

PORTABLE_CLASSES=""

for package in ${COLLECTIONS} ${COLLECTIONS_ITEMS} ${COLLECTIONS_JOIN} ${ENTITIES} ${ENTITIES_ENUMS} ${ENTITIES_JOIN} ${COLLECTIONS_ITEMS_JOIN} ${COLLECTIONS_CONTENTSPEC} ${ENTITIES_CONTENTSPEC}
do
	for file in $package
	do		
		if [ -f $file ]
		then				
			RELATIVE=${file#$BASE_PATH}		
			CLASS=${RELATIVE%$JAVA_EXTENSION}		
			JAVA_PACKAGE=${CLASS//\//.}		
			PORTABLE_CLASSES="${PORTABLE_CLASSES} ${JAVA_PACKAGE}"
		fi
	done
done

echo "${PORTABLE_CLASSES} org.jboss.pressgang.ccms.rest.v1.entities.base.RESTLogDetailsV1"