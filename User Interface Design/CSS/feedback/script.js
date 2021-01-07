var arrList = [];
var element = "<hr/><h2>Feedback Details</h2>";

function addFeedback() {
    arrList.push(document.getElementById("feedback").value);
    var successElement = element + "Successfully Added Feedback Details!"
    document.getElementById("feedback").value = "";
    document.getElementById("result").innerHTML = successElement;
}

function displayFeedback() {
    var displayElements = element;
    for (var itemIndex = 1; itemIndex <= arrList.length; itemIndex++) {
        displayElements += "Feedback " + itemIndex + "<br/>" + arrList[itemIndex - 1] + "<br/>"
    }
    document.getElementById("result").innerHTML = displayElements;
    arrList = []
}
