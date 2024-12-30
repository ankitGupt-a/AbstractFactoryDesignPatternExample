public class Client {
    public static void main(String[] args) {
        UIThemeFactory darkTheme = new DarkThemeUI();
        Button button = darkTheme.createButton();
        Checkbox checkbox = darkTheme.createCheckbox();

        button.render();
        checkbox.render();

        UIThemeFactory lightTheme = new LightThemeUI();
        Button button1 = lightTheme.createButton();
        Checkbox checkbox1 = lightTheme.createCheckbox();
        button1.render();
        checkbox1.render();
    }
}