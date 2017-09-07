var options = {
//   apiResourceUrl : "https://public.api.openprocurement.org/api/2.3/tenders/44e5ae715bd742bfb6a96d97b7112736",
   apiResourceUrl : "http://test:8080/json",
   callbackCheckSign: "checkSign",
   callbackRender: "renderJson",
   verifyOnly: true
};
opSign.init(options);

function checkSign(signData, currData, diff, ownerInfo, timeInfo){
 	console.log(signData);
 	console.log(currData);
 	console.log(diff);
 	console.log(ownerInfo);
 	console.log(timeInfo);
 }

 function checkSign(signData, currData, diff, ownerInfo, timeInfo, test){
 	console.log(signData);
 	console.log(currData);
 	console.log(diff);
 	console.log(ownerInfo);
 	console.log(timeInfo);
 }