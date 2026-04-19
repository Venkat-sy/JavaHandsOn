# Java HandsOn GitHub Setup - Progress Tracker

## Current Status: Starting Step 1/6

### Detailed Steps from Plan:

- [x] **1. Install GitHub CLI (`gh`)**  
       _Status: Already installed._  
       Command: `winget install --id GitHub.cli`  
       _Explanation: Installs GitHub CLI on Windows via winget for repo creation/push._

- [x] **2. Authenticate GitHub CLI**  
      _Status: Logged in._  
      Command: `gh auth login`  
      _Explanation: Interactive login to user's GitHub account (Venkat-sy), uses browser._

- [ ] **3. Commit pending changes**  
       Command: `git add TODO.md && git commit -m "Update TODO with gh install and plan"`  
       _Explanation: Stages modified TODO.md and commits._

- [ ] **4. Create and push repo to GitHub**  
       Command: `gh repo create javaHandsOn --public --source=. --remote=origin --push`  
       _Explanation: Creates https://github.com/Venkat-sy/javaHandsOn (public), sets origin, pushes all code._

- [ ] **5. Update TODO.md with completion**  
       _After step 4, mark all checkboxes done._

- [ ] **6. Verify repo**  
       Command: `gh repo view` or open https://github.com/Venkat-sy/javaHandsOn

**Next: Run commands sequentially via tools, updating checkboxes after each success.**
