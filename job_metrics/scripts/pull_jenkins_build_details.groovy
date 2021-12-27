


def constructJobDetailsAPIUrl(String url , String jobName,String jobId) {
    println("=================================")
    println("Loading Job Details for Job Name : " + jobName + " with Job Id " + jobId)
    def jenkins_url = "${url}/job/${jobName}/job/${jobId}/api/json"
    println(jenkins_url)
    println("=================================")
}


return this





