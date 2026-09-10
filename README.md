# Bank of CLI

Run org.bankofcli.BankApplication with Java 21. Build and run the JUnit suite
with mvn test (or the IntelliJ Maven test lifecycle).

The application keeps the numbered switch menu. Register an account, then log in
with its ID and corresponding PIN. Banking actions use the authenticated account - option 9 logs
out so another account can log in. Option 8 exits. Invalid input returns to the
menu, and end of input exits application.

Rules implemented for this milestone:
- Account IDs are case-sensitive, contain 4-32 printable ASCII characters without spaces, and require at least one uppercase letter, one lowercase letter, one number, and one special character (such as -, $, or #).
- PIN input must contain exactly four digits and can include leading zeros (0000-9999).
  The existing integer interface stores the numeric value and the CLI enforces the four-digit format.
- Registration creates a zero balance and rejects duplicate IDs.
- Deposits, withdrawals, and transfers require positive amounts in whole cents.
- Withdrawals and transfers cannot overdraw an account.
- Transfers require an existing and a different recipient and update both balances and
  both transaction records.
- History shows the latest ten records for the logged-in account, newest first.

Services accept repository interfaces through their constructors. The CLI uses
one shared InMemoryBankRepository because the SQLite repositories are still
stubs (will be implemented next week at the latest). Accounts, PINs, balances, 
and history exist only for the current process. This milestone retains the model's
integer PIN representation; persistent authentication will require replacing it 
with password hashing before credentials are stored on disk.
PIN input is visible in the console.

SLF4J and Logback write application lifecycle, authentication outcomes, and
transaction outcomes to logs/bank.log. Logs do not include PINs, entered account IDs,
balances, or raw exception messages. Transaction records provide the account-specific 
operation details.

JUnit covers service rules, rejected-operation state preservation, atomic transfer
delegation, concurrent withdrawals, log privacy, and scripted CLI login/logout,
transfer, input validation, and account isolation.
