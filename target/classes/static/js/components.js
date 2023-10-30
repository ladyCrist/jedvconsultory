// SERVICES
const ServiceData = [
  {
    nombre: "Control Prenatal",
    descripcion:
      "Seguimiento médico durante el embarazo para garantizar la salud de la madre y el bebé.",
  },
  {
    nombre: "Ecografías",
    descripcion:
      "Exploraciones por ultrasonido para monitorear el desarrollo del feto y detectar posibles complicaciones.",
  },
  {
    nombre: "Parto y Cesárea",
    descripcion:
      "Atención especializada durante el parto, incluyendo partos naturales y cesáreas si es necesario.",
  },
  {
    nombre: "Asesoramiento en Lactancia",
    descripcion:
      "Apoyo y orientación para las madres en la lactancia materna y cuidado del recién nacido.",
  },
  {
    nombre: "Cuidado Postparto",
    descripcion:
      "Atención médica y seguimiento después del parto para asegurar la recuperación de la madre y el bienestar del bebé.",
  },
  {
    nombre: "Planificación Familiar",
    descripcion:
      "Orientación y servicios para ayudar a las parejas a planificar su familia de acuerdo a sus necesidades y preferencias.",
  },
];
let serviceNewHTML = "";
ServiceData.forEach((el, idx) => {
  //Agrega la imagen del medio antes del index 3
  if (idx === 3) {
    serviceNewHTML += `
      <li class="service-banner">
        <figure>
          <img src="./images/service-main.png" width="409" height="467" loading="lazy"
            alt="service banner" class="w-100">
        </figure>
      </li>
    `;
  }

  serviceNewHTML += `
    <li>
      <div class="service-card">
        <div class="card-icon">
          <img src="./images/service-${
            idx + 1
          }.png" width="100" height="100" loading="lazy"
            alt="service-${idx + 1}" class="w-100">
        </div>

        <div>
          <h3 class="h3 card-title">${el.nombre}</h3>
          <p class="card-text">${el.descripcion}</p>
        </div>
      </div>
    </li>
  `;
});
document.getElementById("service-list").innerHTML = serviceNewHTML;

// DOCTORS
const DoctorsData = [
  {
    nombre: "Dra. María Rodríguez",
    especialidad: "Ginecología y Obstetricia",
  },
  {
    nombre: "Dra. Ana González",
    especialidad: "Ecografía Obstétrica",
  },
  {
    nombre: "Dra. Laura Pérez",
    especialidad: "Atención Prenatal",
  },
  {
    nombre: "Dra. Claudia Morales",
    especialidad: "Cirugía Obstétrica",
  },
];
let doctorsNewHTML = "";
DoctorsData.forEach((el, idx) => {
  doctorsNewHTML += `
    <li class="scrollbar-item">
      <div class="doctor-card">
        <div class="card-banner img-holder" style="--width: 460; --height: 500;">
          <img src="./images/obstetra-${
            idx + 1
          }.png" width="460" height="500" loading="lazy" alt="${el.nombre}"
            class="img-cover">
        </div>

        <h3 class="h3"><a href="#" class="card-title">${el.nombre}</a></h3>
        <p class="card-subtitle">${el.especialidad}</p>
        <ul class="card-social-list">
          <li><a href="#" class="card-social-link"><ion-icon name="logo-facebook"></ion-icon></a></li>
          <li><a href="#" class="card-social-link"><ion-icon name="logo-twitter"></ion-icon></a></li>
          <li><a href="#" class="card-social-link"><ion-icon name="logo-instagram"></ion-icon></a></li>
        </ul>
      </div>
    </li>
  `;
});
document.getElementById("obstetras-list").innerHTML = doctorsNewHTML;

// BLOGS
const BlogsData = [
  {
    titulo: "Consejos para un Embarazo Saludable",
    descripcion:
      "Descubre cómo llevar un embarazo feliz y saludable con nuestras recomendaciones.",
    fecha: "Septiembre 15, 2023",
  },
  {
    titulo: "Los Beneficios de la Lactancia Materna",
    descripcion:
      "Aprende sobre los numerosos beneficios de la lactancia materna para ti y tu bebé.",
    fecha: "Agosto 28, 2023",
  },
  {
    titulo: "Etapas del Desarrollo Fetal",
    descripcion:
      "Explora las diferentes etapas del desarrollo fetal durante el embarazo.",
    fecha: "Julio 10, 2023",
  },
];
let blogNewHTML = "";
BlogsData.forEach((el, idx) => {
  blogNewHTML += `
    <li>
      <div class="blog-card">
        <figure class="card-banner img-holder" style="--width: 1180; --height: 800;">
          <img src="./images/blog-${
            idx + 1
          }.png" width="1180" height="800" loading="lazy"
            alt="blog-${idx + 1}" class="img-cover">

          <div class="card-badge">
            <ion-icon name="calendar-outline"></ion-icon>
            <time class="time" datetime="2022-03-24">${el.fecha}</time>
          </div>
        </figure>

        <div class="card-content">
          <h3 class="h3">
            <a href="#" class="card-title">${el.titulo}</a>
          </h3>
          <p class="card-text">${el.descripcion}</p>
          <a href="#" class="card-link">Leer más</a>
        </div>
      </div>
    </li>
  `;
});
document.getElementById("blogs-list").innerHTML = blogNewHTML;
