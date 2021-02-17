var principalAmount = 0, numberOfMonths = 0, interestRate = 0, monthlyInterestRate = 0;

function calculateEMI() {
    principalAmount = document.getElementById("principalAmount").value;
    numberOfMonths = document.getElementById("tenure").value;
    interestRate = document.getElementById("interestRate").value;
    monthlyInterestRate = (interestRate / 100) / 12

    var onePlusRtoPowerOfn = Math.pow((1 + monthlyInterestRate), numberOfMonths)

    emi = principalAmount * monthlyInterestRate * (onePlusRtoPowerOfn / (onePlusRtoPowerOfn - 1))

    document.getElementById("result").innerHTML = "EMI is Rs."+emi.toFixed(2);
    return false;
}
