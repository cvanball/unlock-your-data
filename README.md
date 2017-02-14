## JBoss Data Virtualization orchestration with Ansible

This project is an example showing how to configure a Red Hat JBoss Data Virtualization environment (adding JBoss module, JDBC driver and datasource) using Ansible.

### Prerequisites

1. Install [Ansible](http://www.ansible.com)
2. Install [Red Hat JBoss Data Virtualization](http://developers.redhat.com/products/datavirt/get-started/#Step1)

### Available playbooks

* [Hortonworks Hive JDBC](https://github.com/cvanball/unlock-your-data/tree/master/hdphive2)
* [Red Hat JBoss Data Grid](https://github.com/cvanball/unlock-your-data/tree/master/jdg)
* [MariaDB/MySQL JDBC](https://github.com/cvanball/unlock-your-data/tree/master/mariadb_mysql)
* [Microsoft Excel](https://github.com/cvanball/unlock-your-data/tree/master/msexcel)
* [PostgreSQL JDBC](https://github.com/cvanball/unlock-your-data/tree/master/postgresql)

> Please edit the file */group_vars/all.yml and change the variable jboss_home to point to the home directory of your Red Hat JBoss Data Virtualization environment. 


