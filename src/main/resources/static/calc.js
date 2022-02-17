$(() => {
    const num1 = $("#num1");
    const num2 = $("#num2");

    $("#addi").click(() => {
        if (inputvalidation(num1.val(), num2.val())) {
            $.get("/add?num1=" + num1.val() + "&num2=" + num2.val(), sum => {
                $("#output").html(num1.val() + " + " + $("#num2").val() + " = " + sum);
            });
        } else {
            $("#output").html("Du har ikke oppgitt to tall");
        }
    });

    $("#sub").click(() => {
        if (inputvalidation(num1.val(), num2.val())) {
            $.get("/sub?num1=" + num1.val() + "&num2=" + num2.val(), sum => {
                $("#output").html(num1.val() + " - " + $("#num2").val() + " = " + sum);
            });
        } else {
            $("#output").html("Du har ikke oppgitt to tall");
        }
    });

    $("#mul").click(() => {
        if (inputvalidation(num1.val(), num2.val())) {
            $.get("/mul?num1=" + num1.val() + "&num2=" + num2.val(), sum => {
                $("#output").html(num1.val() + " * " + $("#num2").val() + " = " + sum);
            });
        } else {
            $("#output").html("Du har ikke oppgitt to tall");
        }
    });

    $("#div").click(() => {
        if (num2.val() === "0") {
            $("#output").html("Du kan ikke dele på 0");
        } else if (inputvalidation(num1.val(), num2.val())) {
            $.get("/div?num1=" + num1.val() + "&num2=" + num2.val(), sum => {
                $("#output").html(num1.val() + " / " + $("#num2").val() + " = " + sum);
            });
        } else {
            $("#output").html("Du har ikke oppgitt to tall");
        }
    });

    const inputvalidation = (num1, num2) => {
        return !(isNaN(num1) || isNaN(num2) || num1 === "" || num2 === "");
    }
});