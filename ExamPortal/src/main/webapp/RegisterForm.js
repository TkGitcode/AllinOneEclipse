const form = document.getElementById("form");
const nameInput = document.getElementById("name");
const emailInput = document.getElementById("email");
const passwordInput = document.getElementById("password");
const cpasswordInput = document.getElementById("cpassword");
const small = document.getElementById("small");

form.addEventListener("submit", (e) => {
  e.preventDefault();
  if (cpasswordInput.value !== passwordInput.value) {
    small.classList.add("small-visible");
  } else {
    small.classList.remove("small-visible");
  }
});
