// 1. Basics
console.log("Welcome to Community Portal");

window.addEventListener("load", () => {
    alert("Page loaded successfully");
});


// 2. Variables
const eventName = "Music Fest";
let seats = 50;
console.log(eventName, seats);


// 3. Events array
let events = [
    { name: "Music Fest", date: "2026-07-10", seats: 10, category: "Music" },
    { name: "Food Carnival", date: "2026-08-01", seats: 5, category: "Food" }
];


// 4. Add event
function addEvent(name, category, seats, date) {
    events.push({ name, category, seats, date });
}


// 5. Closure
function counter() {
    let count = 0;
    return () => ++count;
}
const track = counter();


// 6. Prototype
function Event(name, category, seats) {
    this.name = name;
    this.category = category;
    this.seats = seats;
}
Event.prototype.checkAvailability = function () {
    return this.seats > 0;
};


// 7. Arrays
let musicEvents = events.filter(e => e.category === "Music");


// 8. DOM Manipulation
function renderEvents() {
    const container = document.getElementById("eventContainer");
    container.innerHTML = "";

    events.forEach(e => {
        const div = document.createElement("div");
        div.textContent = `${e.name} - Seats: ${e.seats}`;
        container.appendChild(div);
    });
}


// 9. Event Handling
document.addEventListener("DOMContentLoaded", () => {
    const search = document.getElementById("search");

    search.addEventListener("keydown", (e) => {
        console.log("Typing:", e.target.value);
    });
});


// 10. Async Fetch
async function fetchEvents() {
    const res = await fetch("https://jsonplaceholder.typicode.com/posts");
    const data = await res.json();
    console.log(data.slice(0, 3));
}


// 11. Form Handling
function handleForm(event) {
    event.preventDefault();

    const form = event.target;
    console.log(form.name.value, form.email.value);
}


// 12. POST API
async function submitRegistration(user) {
    const res = await fetch("https://jsonplaceholder.typicode.com/posts", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(user)
    });

    const data = await res.json();
    console.log("Submitted:", data);
}


// 13. Debugging
function debugForm() {
    console.log("Debug mode active");
    debugger;
}


// 14. Modern JS
const clone = [...events];

function showEvent({ name, category, seats }) {
    console.log(name, category, seats);
}