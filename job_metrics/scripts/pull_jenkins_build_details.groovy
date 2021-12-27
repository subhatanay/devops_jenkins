

def jenkins_url = "http://localhost:8080/job/{Job_Name}/job/{Job_ID}/api/json"


def fetchJenkinsJobDetails(String jobName,String jobId) {
    println("=================================")
    println("Loading Job Details for Job Name : " + jobName + " with Job Id " + jobId)
    def job_url = jenkins_url.replace("{Job_Name}",jobName).replace("{Job_ID}",jobId)
    println("Jenkins Job URL : " + job_url)
    println("=================================")
}


return this





