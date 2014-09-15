$ ->
  jsXHR = $.getJSON("/users")
  jsXHR.done((json) ->
    new Vue
      el: "#user_model"
      created: ->
        $(".edit").hide()
      data:
        "users" : json
      methods:
        "edit": (index) ->
          $("#edit_#{index}").toggle()
        "save": (index) ->
          $.ajax
            type: "post"
            url: "/users/update"
            data: JSON.stringify(this.users[index])
            contentType: "application/json"
          .done ->
            msgPart = $("#err_msg_#{index}")
            msgPart.text("Success!")
            setTimeout(
              () -> $("#edit_#{index}").hide(); msgPart.text("")
              700)
          .fail -> $("#err_msg_#{index}").text("Error has occured!")
    )
