


def constructJobDetailsAPIUrl(String url ,String jobId) { 
    def jenkins_url = "${url}/${jobId}/api/json"  
    return jenkins_url;
}

def convertJsonStringToJsonObject(jsonString) { 
    jsonData = readJSON text:jsonString 
    return jsonData
}

def convertMapToJsonString(jsonObject) {
    def json = new groovy.json.JsonBuilder()
    json rootKey: jsonObject
    return groovy.json.JsonOutput.prettyPrint(json.toString())
} 

def fetchStaticJobConfiguration() { 
    def jobConfigObject = readJSON file:'./job_metrics/job_config.json'
    return jobConfigObject
}