import groovy.json.JsonSlurper
import groovy.json.JsonOutput
import groovy.json.JsonBuilder 

node {
  def vmname="Redis"
  def vmsize="20"
  def vmtype="t2.medium"
  def ostype="RHEL"
  def imageid="ami-0a9d27a9f4f5c0efc"
  def vmcount="6"
  def keyname="jenkins"
  def securitygroupid="sg-8ed10bec"
  def subnetid="subnet-dc5068b4"
  def rootdir="/var/lib/jenkins"
  
  stage ('Loading common Files'){
    checkout scm
    common=load "${rootdir}/newpro/common.groovy"
  }
}
 return this ;

