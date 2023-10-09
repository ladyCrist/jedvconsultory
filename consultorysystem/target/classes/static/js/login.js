const bullets = document.querySelectorAll(".bullets span");
const images = document.querySelectorAll(".image");
const textSlider = document.querySelector(".text-group");

let currentSlide = 1;

// Javascript for image slider manual navigation
const manualNav = function (index) {
  images.forEach((slide) => {
    slide.classList.remove("show");

    bullets.forEach((btn) => {
      btn.classList.remove("active");
    });
  });

  textSlider.style.transform = `translateY(${-index * 5}rem)`;

  images[index].classList.add("show");
  bullets[index].classList.add("active");
};

bullets.forEach((btn, i) => {
  btn.addEventListener("click", () => {
    manualNav(i);
    currentSlide = i;
  });
});

// Javascript for image slider autoplay navigation
const repeat = function (activeClass) {
  let active = document.getElementsByClassName("active");
  let show = document.getElementsByClassName("show");

  let i = 1;

  const repeater = () => {
    setTimeout(function () {
      [...active].forEach((activeSlide) => {
        activeSlide.classList.remove("active");
      });

      [...show].forEach((showSlide) => {
        showSlide.classList.remove("show");
      });

      textSlider.style.transform = `translateY(${-i * 5}rem)`;

      images[i].classList.add("show");
      bullets[i].classList.add("active");
      i++;

      if (images.length == i) {
        i = 0;
      }
      if (i >= images.length) {
        return;
      }
      repeater();
    }, 4000);
  };
  repeater();
};

repeat();

// FOCUS EN LOS INPUTS
const inputs = document.querySelectorAll(".input-field");
const toggle_btn = document.querySelectorAll(".toggle");
const main = document.querySelector(".main-login-register");

inputs.forEach((inp) => {
  inp.addEventListener("focus", () => {
    inp.classList.add("up");
  });

  inp.addEventListener("blur", () => {
    if (inp.value != "") return;
    inp.classList.remove("up");
  });
});

toggle_btn.forEach((btn) => {
  btn.addEventListener("click", () => {
    main.classList.toggle("sign-up-mode");
  });
});

// PASSWORD VISIBILITY
const eyes = document.querySelectorAll(".show-hidden");
const passes = document.querySelectorAll(".pass");

eyes.forEach((eye) => {
  eye.addEventListener("click", () => {
    passes.forEach((pass) => {
      if (pass.type === "password") {
        pass.type = "text";
        eye.classList.replace("fa-eye", "fa-eye-slash");
      } else {
        pass.type = "password";
        eye.classList.replace("fa-eye-slash", "fa-eye");
      }
    });
  });
});
