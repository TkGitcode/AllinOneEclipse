<html>
<body>
<form action="applicationform" method="post" enctype="multipart/form-data" >
 <label>Name</label>
<input type="text" placeholder="Name" name="name">
<br>
<br>
<label>Mail Id</label>
<input type="text" placeholder="Mailid" name="mail">
<br>
<br>
<label>MobileNo</label>
<input type="text" placeholder="MobileNumber" name="mblno">
<br>
<br>
<label for="genders">Gender</label>
<select name="gender" id="genders">
<option value="male">Male</option>
<option value="female">Female</option>
<option value="other">Others</option>
</select>
<br>
<br>
<label for="roleapplied">Role applied for</label>
<select name="role" id="roleapplied">
<option value="Developer">Developer</option>
<option value="Tester">Tester</option>
<option value="Any">Any</option>
</select>
<br>
<br>
<label>College Name</label>
<input type="text" placeholder="CollegeName" name="clgname">
<br>
<br>
<label>Degree/Dept</label>
<input type="text" placeholder="Degree/Dept" name="degdep">
<br>
<br>
<label for="yearofpasssing">Year of Passing</label>
<select name="yearpass" id="yearofpasssing">
<option value="2022">2022</option>
<option value="2021">2021</option>
<option value="2020">2020</option>
</select>
<br>
<br>
<label>TotalYearOfExperience</label>
<input type="text" placeholder="TotalYearOfExperience" name="totyrExp">
<br>
<br>
<label>CurrentEmployee</label>
<input type="text" placeholder="CurrentEmployee" name="crtemp">
<br>
<br>
<label>CurrentDesignation</label>
<input type="text" placeholder="CurrentDesignation" name="crtdesg">
<br>
<br>
<label for="skillset">Skill Set</label>
<select name="sklst" id="skillset">
<option value="Java">Java</option>
<option value=".Net">.Net</option>
<option value="HTML/CSS">HTML/CSS</option>
</select>
<br>
<br>
<label >CurrentCTC</label>
<input type="text" placeholder="CurrentCTC" name="crtctc" >
<br>
<br>
<label>ExpectedCTC</label>
<input type="text" placeholder="ExpectedCTC" name="expctc">
<br>
<br>
<label>NoticePeriodCTC</label>
<input type="text" placeholder="NoticePeriodCTC" name="ntcprd">
<br>
<br>
<label>NativeDistrict</label>
<input type="text" placeholder="NativeDistrict" name="ntvdis">
<br>
<br>
<label>Availability</label>
<input type="text" placeholder="Availability" name="avlbty">
<br>
<br>
<label>Upload your Resume/CV</label>
<input type="file" name="fileupload" multiple>
<br>
<br>
<input type="submit" value="Submit">
</form>
</body>
</html>
