import java.util.regex.Matcher;		
import java.util.regex.Pattern;		
import groovy.json.JsonSlurper;
import groovy.json.JsonSlurperClassic
import groovy.json.*

import java.util.Map;
import java.io.Reader;
import java.util.HashMap;


def mobile (){
 sh """
 	echo "9972045653"
    """
}

def vm_creation (def imageid, def vmcount, def vmtype, def keyname, def securitygroupid, def subnetid){
 sh '''
    aws ec2 run-instances --image-id ${imageid} --block-device-mappings file:///tmp/maping.json --count ${vmcount} --instance-type ${vmtype} --key-name ${keyname} --security-group-ids ${securitygroupid} --subnet-id ${subnetid}
'''
   
return this 
