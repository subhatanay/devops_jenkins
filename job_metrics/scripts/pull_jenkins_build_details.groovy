

def jenkins_url = "http://localhost:8080/job/{Job_Name}/job/{Job_ID}/api/json"


def fetchJenkinsJobDetails(String jobName,String jobId) {
    println("=================================")
    println("Loading Job Details for Job Name : " + args[0] + " with Job Id " + args[1])
    def job_url = jenkins_url.replace("{Job_Name}",args[0]).replace("{Job_ID}",args[1])
    println("Jenkins Job URL : " + job_url)
    println("=================================")
}


return this





