$(() => {
    $("#getAmount").click(() => {
        const currency = $("#currency").val()
        const value = $("#value").val()

        const amount = {
            currency: currency,
            value: value
        }

        $.get("/calc", amount, nok => {
            if (nok !== 0.0){
                $("#output").html(value + " i " + currency + " blir: " + nok + " kr")
            }else {
                $("#output").html("Du skrev inn ugyldig valutasort")
            }
        })
    })
})