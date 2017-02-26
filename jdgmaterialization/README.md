## Demystified - Using external materialized views in Red Hat JBoss Data Virtualization with Red Hat JBoss Data Grid

### Prerequisites

#### System Requirements

1. At least 8 GB of available RAM
2. At least 10 GB of available disk space
3. At least 2 CPU cores

#### Software Requirements
1. [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
   * Ensure that **JAVA_HOME** environment variable is set
   * Ensure that **$JAVA_HOME/bin** is on the **PATH** so that you can run **java** on command line at prompt from any folder
2. [JBoss Developer Studio 10.3.0](https://developers.redhat.com/download-manager/file/devstudio-10.3.0.GA-installer-eap.jar) with JBoss Data Virtualization Development installed
3. [JBoss Data Virtualization 6.3.0](https://developers.redhat.com/download-manager/content/origin/files/sha256/b4/b466affbcc1740bf2c7c73b60bb6ffa7e1ec844fc08447224ab15aa3bcee3949/jboss-dv-6.3.0-1-installer.jar)
4. [JBoss Data Virtualization Update 04](https://access.redhat.com/jbossnetwork/restricted/softwareDownload.html?softwareId=49801)
5. [JBoss Data Grid 6.6 Server](https://developers.redhat.com/download-manager/file/jboss-datagrid-6.6.0-server.zip)
6. [JBoss Data Grid 6.6.1 Server Update](https://access.redhat.com/jbossnetwork/restricted/softwareDownload.html?softwareId=46451)
7. [JDG 6.6.1 Hot Rod Java Client Module for JBoss EAP](https://access.redhat.com/jbossnetwork/restricted/softwareDownload.html?softwareId=46581)

#### Using Ansible
To configure the environment using Ansible one might change the default installation directory of Red Hat JBoss Data Grid and Red Hat JBoss Data Virtualization to accomodate your environment.

- Change installpath value in files/xml/dv63_install.xml
- Change install_home variable in group_vars/all.yml


