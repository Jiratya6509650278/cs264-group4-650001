$.ajax({
    url: "/find-all",
    type: "GET",
    success: function(data) {
        var tutorials = data;

        var tutorialListDiv = $("#tutorialList");
        tutorials.forEach(function(tutorial) {
            /*document.write(tutorial.date);
            document.write(tutorial.prefix);*/

            var studentId = tutorial.studentId;
            var name = tutorial.name;
            /*tutorialListDiv.append("<p><a href='Test.html'>" + name + " รหัสนักศึกษา: " + studentId + "</a></p>");*/

            var link = $("<a>").attr("href", "studentForm.html?studentId=" + studentId).text(name + " รหัสนักศึกษา: " + studentId);

            var paragraph = $("<p>").append(link);

            tutorialListDiv.append(paragraph);

        });
    },
});
