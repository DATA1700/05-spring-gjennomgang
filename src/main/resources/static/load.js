$(() => {
    $("#load").click(() => {
        $.post("/load", (data, status) => {
            console.log(status);
            if (status === "success"){
                alert("Valuttaene er lastet")
            }else {
                alert("Valuttaene er ikke lastet")
            }
        })
    })
})