// rol.js
function crearRol(nombre, accion) {
    return {
        nombre,
        accion,
        ejecutar: function() {
            console.log(this.accion);
        }
    };
}

// persona.js
function crearPersona(nombre) {
    return {
        nombre,
        roles: [],
        agregarRol: function(rol) {
            this.roles.push(rol);
        },
        ejecutarRoles: function() {
            this.roles.forEach(rol => {
                console.log(`${this.nombre} realiza: ${rol.accion}`);
            });
        }
    };
}

// main.js
const novia = crearPersona("Ana");
const padrino = crearPersona("Carlos");
const musico = crearPersona("Luis");

const cortarPastel = crearRol("Cortar el pastel", "corta el pastel");
const primerVals = crearRol("Bailar el primer vals", "baila el primer vals");
const tocarMusica = crearRol("Tocar música", "toca música");

novia.agregarRol(cortarPastel);
padrino.agregarRol(primerVals);
musico.agregarRol(tocarMusica);

novia.ejecutarRoles();
padrino.ejecutarRoles();
musico.ejecutarRoles();
