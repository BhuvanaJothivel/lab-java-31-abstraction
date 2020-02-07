<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Document</title>
   <link rel="stylesheet" href="./asset/style.css" /> 
  </head>
  <body>
   <form id="myform" action="/lab-java-31-abstraction/eligible" method="post">
      <div class="row">
        <div class="column">
          <div class="container">
            <h1>Personal Details</h1>
            <p>Please fill in this form to evaluate your basic eligibility.</p>
            <hr />

            <label for="Name"><b>Name</b></label
            ><br />
            <input
              type="text"
              placeholder="Enter Name"
              name="name"
              required
            /><br />

            <label for="Father Name"><b>Father Name</b></label
            ><br />
            <input
              type="text"
              placeholder="Enter Father Name"
              name="fname"
              required
            /><br />

            <label for="Age"><b>Age</b></label
            ><br />
            <input
              type="number"
              placeholder="Enter Your Age"
              name="age"
              required
            /><br />

            <label for="Gender"><b>Gender</b></label
            ><br />
            <input type="radio" name="gender" value="male" checked /> Male
            <input type="radio" name="gender" value="female" /> Female
            <input type="radio" name="gender" value="other" /> Other
            <br />
            <br />

            <label for="Maritial Status"><b>Maritial Status</b></label
            ><br />
              <input type="radio" name="status" value="Married" checked /> Married
              <input type="radio" name="status" value="Unmarried" /> Unmarried<br />
            <br/>

            <label for="Country"><b>Country</b></label
            ><br />
            <input
              type="text"
              placeholder="India"
              name="country"
              required
            /><br />

            <label for="Degree"><b>Degree</b></label
            ><br />
            <select name="degree">
              <option value="B.E">B.E</option>
              <option value="B.Tech">B.Tech</option>
              <option value="M.Sc">M.Sc</option>
              <option value="Other">Other</option> </select
            ><br />

            <hr />
          </div>
        </div>
        <div class="column">
          <div class="container">
            <h1>Physical and Medical Test</h1>
            <p>
              Please fill in this form to evaluate your physical and medical
              standard.
            </p>
            <hr />
            <label for="Height"><b>Height</b></label
            ><br />
            <input
              type="number"
              placeholder="Enter in cm"
              name="height"
              required
            /><br />

            <label for="Weight"><b>Weight</b></label
            ><br />
            <input
              type="number"
              placeholder="Enter in kg"
              name="weight"
              required
            /><br />

            <label for="tooth"><b>Tooth Count</b></label
            ><br />
            <input
              type="number"
              placeholder="Dental Points"
              name="tooth"
              required
            /><br />

            <label for="vision"><b>Vision</b></label
            ><br />
            <input type="radio" name="eye" value="6/6" checked /> 6/6
            <input type="radio" name="eye" value="6/9" /> 6/9
            <input type="radio" name="eye" value="other" /> Other
            <br />
            <br />
            <hr />
          </div>
        </div>
        <div class="column">
          <div class="container">
            <h1>Knowledge, Skills & Attempts</h1>
            <p>
              Please fill in this form to validate your Knowledge, Skills &
              Attempts.
            </p>
            <hr />
            <label for="Swimming"><b>Know Swimming</b></label
            ><br />
            <input type="radio" name="swim" value="yes" checked /> Yes
            <input type="radio" name="swim" value="no" /> No
            <br />
            <br />
            <br />
            <br />
            <label for="Computer"><b>Knowledge of computer</b></label
            ><br />
            <input type="radio" name="computer" value="yes" checked /> Yes
            <input type="radio" name="computer" value="no" /> No
            <br />
            <br />
            <br />
            <br />
            <label for="IAS"><b>Number of IAS attempts</b></label
            ><br />
            <input
              type="number"
              placeholder="Enter the number of IAS attempts"
              name="attempts"
              required
            /><br />
            <br />
            <hr />
            <label for="post"><b>Am I Eligible For</b></label
            ><br />
            <select name="exam">
              <option value="CDS">CDS</option>
              <option value="IAS">IAS</option>
              <option value="IBPS Clerk">IBPS Clerk</option></select
            ><br />
            <br />
            <br />
            <br />
            <br />
            <button type="submit" class="registerbtn">Check</button>
            <br />
          </div>
        </div>
      </div>
    </form>
  </body>
</html>
