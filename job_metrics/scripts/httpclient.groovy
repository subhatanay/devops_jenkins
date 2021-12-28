
def getRequest(String url) {
    def response = httpRequest acceptType: 'APPLICATION_JSON',
                                httpMode: 'GET',
                                consoleLogResponseBody: false,
                                authentication: 'jenkins-api',
                                contentType: 'APPLICATION_JSON',
                                ignoreSslErrors: true,
                                responseHandle: 'LEAVE_OPEN',
                                url: url
   
    if (response.status == 200) {
         return convertJsonStringToJsonObject(response.content) 
    } else {
         return convertJsonStringToJsonObject('{ "errorCode": "500"}')  
    }  
}