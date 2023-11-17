var urlParams = new URLSearchParams(window.location.search);
var studentId = urlParams.get('studentId');
var apiUrl = '/findById/' + studentId;

function populateForm(data) {
    document.getElementById('date').value = data.date;

    document.getElementById('prefix').value = data.prefix;
    document.getElementById('name').value = data.name;
    document.getElementById('studentId').value = data.studentId;
    document.getElementById('studentYear').value = data.studentYear;
    document.getElementById('studyField').value = data.studyField;
    document.getElementById('advisor').value = data.advisor;

    document.getElementById('addressNumber').value = data.addressnumber;
    document.getElementById('moo').value = data.moo;
    document.getElementById('tumbol').value = data.tumbol;
    document.getElementById('amphur').value = data.amphur;
    document.getElementById('province').value = data.province;
    document.getElementById('postalCode').value = data.postalCode;
    document.getElementById('mobilePhone').value = data.mobilePhone;
    document.getElementById('phone').value = data.phone;

    document.getElementById('nadd').value = data.nadd;
    document.getElementById('ndrop').value = data.ndrop;

    document.getElementById('cause').value = data.cause;

    var subjectCodeArray = data.subjectCode.split(',');
    document.getElementsByName('subjectCode')[0].value = subjectCodeArray[0];
    document.getElementsByName('subjectCode')[1].value = subjectCodeArray[1];
    document.getElementsByName('subjectCode')[2].value = subjectCodeArray[2];
    document.getElementsByName('subjectCode')[3].value = subjectCodeArray[3];
    document.getElementsByName('subjectCode')[4].value = subjectCodeArray[4];
    document.getElementsByName('subjectCode')[5].value = subjectCodeArray[5];
    document.getElementsByName('subjectCode')[6].value = subjectCodeArray[6];
    document.getElementsByName('subjectCode')[7].value = subjectCodeArray[7];
    document.getElementsByName('subjectCode')[8].value = subjectCodeArray[8];
    document.getElementsByName('subjectCode')[9].value = subjectCodeArray[9];

    var subjectNameArray = data.subjectName.split(',');
    document.getElementsByName('subjectName')[0].value = subjectNameArray[0];
    document.getElementsByName('subjectName')[1].value = subjectNameArray[1];
    document.getElementsByName('subjectName')[2].value = subjectNameArray[2];
    document.getElementsByName('subjectName')[3].value = subjectNameArray[3];
    document.getElementsByName('subjectName')[4].value = subjectNameArray[4];
    document.getElementsByName('subjectName')[5].value = subjectNameArray[5];
    document.getElementsByName('subjectName')[6].value = subjectNameArray[6];
    document.getElementsByName('subjectName')[7].value = subjectNameArray[7];
    document.getElementsByName('subjectName')[8].value = subjectNameArray[8];
    document.getElementsByName('subjectName')[9].value = subjectNameArray[9];

    var subjectSectionArray = data.subjectSection.split(',');
    document.getElementsByName('subjectSection')[0].value = subjectSectionArray[0];
    document.getElementsByName('subjectSection')[1].value = subjectSectionArray[1];
    document.getElementsByName('subjectSection')[2].value = subjectSectionArray[2];
    document.getElementsByName('subjectSection')[3].value = subjectSectionArray[3];
    document.getElementsByName('subjectSection')[4].value = subjectSectionArray[4];
    document.getElementsByName('subjectSection')[5].value = subjectSectionArray[5];
    document.getElementsByName('subjectSection')[6].value = subjectSectionArray[6];
    document.getElementsByName('subjectSection')[7].value = subjectSectionArray[7];
    document.getElementsByName('subjectSection')[8].value = subjectSectionArray[8];
    document.getElementsByName('subjectSection')[9].value = subjectSectionArray[9];

    var subjectDateArray = data.subjectDate.split(',');
    document.getElementsByName('subjectDate')[0].value = subjectDateArray[0];
    document.getElementsByName('subjectDate')[1].value = subjectDateArray[1];
    document.getElementsByName('subjectDate')[2].value = subjectDateArray[2];
    document.getElementsByName('subjectDate')[3].value = subjectDateArray[3];
    document.getElementsByName('subjectDate')[4].value = subjectDateArray[4];
    document.getElementsByName('subjectDate')[5].value = subjectDateArray[5];
    document.getElementsByName('subjectDate')[6].value = subjectDateArray[6];
    document.getElementsByName('subjectDate')[7].value = subjectDateArray[7];
    document.getElementsByName('subjectDate')[8].value = subjectDateArray[8];
    document.getElementsByName('subjectDate')[9].value = subjectDateArray[9];

    var subjectCreditArray = data.subjectCredit.split(',');
    document.getElementsByName('subjectCredit')[0].value = subjectCreditArray[0];
    document.getElementsByName('subjectCredit')[1].value = subjectCreditArray[1];
    document.getElementsByName('subjectCredit')[2].value = subjectCreditArray[2];
    document.getElementsByName('subjectCredit')[3].value = subjectCreditArray[3];
    document.getElementsByName('subjectCredit')[4].value = subjectCreditArray[4];
    document.getElementsByName('subjectCredit')[5].value = subjectCreditArray[5];
    document.getElementsByName('subjectCredit')[6].value = subjectCreditArray[6];
    document.getElementsByName('subjectCredit')[7].value = subjectCreditArray[7];
    document.getElementsByName('subjectCredit')[8].value = subjectCreditArray[8];
    document.getElementsByName('subjectCredit')[9].value = subjectCreditArray[9];

    var subjectTeacherArray = data.subjectTeacher.split(',');
    document.getElementsByName('subjectTeacher')[0].value = subjectTeacherArray[0];
    document.getElementsByName('subjectTeacher')[1].value = subjectTeacherArray[1];
    document.getElementsByName('subjectTeacher')[2].value = subjectTeacherArray[2];
    document.getElementsByName('subjectTeacher')[3].value = subjectTeacherArray[3];
    document.getElementsByName('subjectTeacher')[4].value = subjectTeacherArray[4];
    document.getElementsByName('subjectTeacher')[5].value = subjectTeacherArray[5];
    document.getElementsByName('subjectTeacher')[6].value = subjectTeacherArray[6];
    document.getElementsByName('subjectTeacher')[7].value = subjectTeacherArray[7];
    document.getElementsByName('subjectTeacher')[8].value = subjectTeacherArray[8];
    document.getElementsByName('subjectTeacher')[9].value = subjectTeacherArray[9];

    var subjectTeacherCheckArray = data.subjectTeacherCheck.split(',');
    document.getElementsByName('subjectTeacherCheck')[0].value = subjectTeacherCheckArray[0];
    document.getElementsByName('subjectTeacherCheck')[1].value = subjectTeacherCheckArray[1];
    document.getElementsByName('subjectTeacherCheck')[2].value = subjectTeacherCheckArray[2];
    document.getElementsByName('subjectTeacherCheck')[3].value = subjectTeacherCheckArray[3];
    document.getElementsByName('subjectTeacherCheck')[4].value = subjectTeacherCheckArray[4];
    document.getElementsByName('subjectTeacherCheck')[5].value = subjectTeacherCheckArray[5];
    document.getElementsByName('subjectTeacherCheck')[6].value = subjectTeacherCheckArray[6];
    document.getElementsByName('subjectTeacherCheck')[7].value = subjectTeacherCheckArray[7];
    document.getElementsByName('subjectTeacherCheck')[8].value = subjectTeacherCheckArray[8];
    document.getElementsByName('subjectTeacherCheck')[9].value = subjectTeacherCheckArray[9];

   /* document.getElementsByName('subjectCode')[0].value = data.subjectCode;
    document.getElementsByName('subjectName')[0].value = data.subjectName;
    document.getElementsByName('subjectSection')[0].value = data.subjectSection;
    document.getElementsByName('subjectDate')[0].value = data.subjectDate;
    document.getElementsByName('subjectCredit')[0].value = data.subjectCredit;
    document.getElementsByName('subjectTeacher')[0].value = data.subjectTeacher;
    document.getElementsByName('subjectTeacherCheck')[0].checked = data.subjectTeacherCheck;*/

}

fetch(apiUrl)
    .then(response => response.json())
    .then(jsonData => {
        populateForm(jsonData);
    })
    .catch(error => console.log('Error:', error));

function submitForm() {
    var studentIdValue = $('#studentId').val();
    var formAction = '/update/' + studentIdValue;
    $('#updateForm').attr('action', formAction);
    $('#updateForm').submit();
}


