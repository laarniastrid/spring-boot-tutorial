@RestController
class ThisWillActuallyRun {

    @RequestMapping("/")
    String home() {
        return "hello, world!";
    }

}