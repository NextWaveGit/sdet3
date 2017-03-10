$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Login Feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "duration": 349402,
  "status": "passed"
});
formatter.before({
  "duration": 125392,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Launch FireFox",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.setUp()"
});
formatter.result({
  "duration": 106241209,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "check user for valid login",
  "description": "",
  "id": "login-feature;check-user-for-valid-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@FirstDryRun"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user successfully logs in",
  "rows": [
    {
      "cells": [
        "login",
        "password"
      ],
      "line": 9
    },
    {
      "cells": [
        "adith.naveen",
        "testing1"
      ],
      "line": 10
    },
    {
      "cells": [
        "lee",
        "hello"
      ],
      "line": 11
    },
    {
      "cells": [
        "sweta",
        "fdfak"
      ],
      "line": 12
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.user_successfully_logs_in(DataTable)"
});
formatter.result({
  "duration": 5038430,
  "status": "passed"
});
formatter.before({
  "duration": 184295,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Launch FireFox",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.setUp()"
});
formatter.result({
  "duration": 174477,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "check user for valid login",
  "description": "",
  "id": "login-feature;check-user-for-valid-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@BeforeRelease"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user successfully logs in",
  "rows": [
    {
      "cells": [
        "login",
        "password"
      ],
      "line": 17
    },
    {
      "cells": [
        "adith.naveen",
        "testing1"
      ],
      "line": 18
    },
    {
      "cells": [
        "lee",
        "hello"
      ],
      "line": 19
    },
    {
      "cells": [
        "sweta",
        "fdfak"
      ],
      "line": 20
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.user_successfully_logs_in(DataTable)"
});
formatter.result({
  "duration": 771539,
  "status": "passed"
});
formatter.before({
  "duration": 112004,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Launch FireFox",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.setUp()"
});
formatter.result({
  "duration": 114682,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "check user for valid login",
  "description": "",
  "id": "login-feature;check-user-for-valid-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@AfterRelease"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "user successfully logs in",
  "rows": [
    {
      "cells": [
        "login",
        "password"
      ],
      "line": 25
    },
    {
      "cells": [
        "adith.naveen",
        "testing1"
      ],
      "line": 26
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "Show inbox",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.user_successfully_logs_in(DataTable)"
});
formatter.result({
  "duration": 156182,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.show_inbox()"
});
formatter.result({
  "duration": 156628,
  "status": "passed"
});
});