#!/bin/sh

echo Installing Jenkins repository
	wget -q -O - http://pkg.jenkins-ci.org/debian/jenkins-ci.org.key | apt-key add -	
	echo 'deb http://pkg.jenkins-ci.org/debian binary/' | tee /etc/apt/sources.list.d/jenkins.list

echo Install APT Packages
	apt-get update

echo Installing Jenkins
	apt-get install -y jenkins
