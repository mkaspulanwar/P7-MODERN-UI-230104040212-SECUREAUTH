package id.antasari.p7_modern_ui_230104040212

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import id.antasari.p7_modern_ui_230104040212.ui.auth.AuthUiState
import id.antasari.p7_modern_ui_230104040212.ui.theme.P7ModernUiTheme

@Composable
fun SettingsScreen(
    uiState: AuthUiState,
    onBackClick: () -> Unit = {},
    onBiometricToggle: (Boolean) -> Unit = {},
    onDarkThemeToggle: (Boolean) -> Unit = {},
    onAppLockToggle: (Boolean) -> Unit = {},
    onLoginAlertsToggle: (Boolean) -> Unit = {},
    onNewDeviceAlertsToggle: (Boolean) -> Unit = {},
    onWifiWarningToggle: (Boolean) -> Unit = {},
    onDeleteAccountClick: () -> Unit = {}
) {
    val scrollState = rememberScrollState()

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
                .statusBarsPadding()
                .padding(horizontal = 24.dp, vertical = 16.dp)
        ) {
            // --- Top bar ---
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = onBackClick) {
                    Icon(Icons.Filled.ArrowBack, contentDescription = "Back")
                }
                Spacer(modifier = Modifier.width(8.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "Security settings",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.SemiBold
                    )
                    Text(
                        text = "Manage how ${uiState.name} keeps this account safe.",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // --- Section: Account & sign-in ---
            Text(
                text = "Account & sign-in",
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            Spacer(modifier = Modifier.height(8.dp))

            ElevatedCard(shape = RoundedCornerShape(20.dp), modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp)) {
                    // Biometric Toggle
                    SettingsSwitchItem(
                        title = "Biometric sign-in",
                        description = "Use fingerprint or face recognition when signing in.",
                        icon = Icons.Filled.Fingerprint,
                        checked = uiState.isBiometricEnabled,
                        onCheckedChange = onBiometricToggle
                    )
                    Divider(modifier = Modifier.padding(vertical = 8.dp))
                    // App Lock Toggle
                    SettingsSwitchItem(
                        title = "App Lock",
                        description = "Lock the app automatically when you leave it for a while.",
                        icon = Icons.Filled.Lock,
                        checked = uiState.appLockEnabled,
                        onCheckedChange = onAppLockToggle
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            // --- Section: Appearance (NEW) ---
            Text(
                text = "Appearance",
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            Spacer(modifier = Modifier.height(8.dp))
            ElevatedCard(shape = RoundedCornerShape(20.dp), modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp)) {
                    // Dark Theme Toggle
                    SettingsSwitchItem(
                        title = "Dark Theme",
                        description = "Use dark colors for the UI.",
                        icon = Icons.Filled.DarkMode,
                        checked = uiState.isDarkTheme,
                        onCheckedChange = onDarkThemeToggle
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            // --- Section: Alerts & notifications ---
            Text(
                text = "Alerts & notifications",
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            Spacer(modifier = Modifier.height(8.dp))
            ElevatedCard(shape = RoundedCornerShape(20.dp), modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp)) {
                    SettingsSwitchItem(
                        title = "Login alerts",
                        description = "Get notified when someone signs in with your account.",
                        icon = Icons.Filled.Notifications,
                        checked = uiState.loginAlertsEnabled,
                        onCheckedChange = onLoginAlertsToggle
                    )
                    Divider(modifier = Modifier.padding(vertical = 8.dp))
                    SettingsSwitchItem(
                        title = "New device alerts",
                        description = "Warn me when my account is used on a new device.",
                        icon = Icons.Filled.Devices,
                        checked = uiState.newDeviceAlertsEnabled,
                        onCheckedChange = onNewDeviceAlertsToggle
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            // --- Section: Network ---
            Text(
                text = "Network & activity",
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            Spacer(modifier = Modifier.height(8.dp))
            ElevatedCard(shape = RoundedCornerShape(20.dp), modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp)) {
                    SettingsSwitchItem(
                        title = "Public Wi-Fi warnings",
                        description = "Recommend extra verification when using open networks.",
                        icon = Icons.Filled.Wifi,
                        checked = uiState.publicWifiWarningEnabled,
                        onCheckedChange = onWifiWarningToggle
                    )
                }
            }

            Spacer(modifier = Modifier.height(32.dp))

            // --- DELETE ACCOUNT BUTTON ---
            Button(
                onClick = onDeleteAccountClick,
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.errorContainer,
                    contentColor = MaterialTheme.colorScheme.onErrorContainer
                ),
                shape = RoundedCornerShape(999.dp)
            ) {
                Icon(Icons.Filled.Delete, null, modifier = Modifier.size(18.dp))
                Spacer(modifier = Modifier.width(8.dp))
                Text("Delete Account", fontWeight = FontWeight.Bold)
            }

            Spacer(modifier = Modifier.height(32.dp))
        }
    }
}

@Composable
private fun SettingsSwitchItem(
    title: String,
    description: String,
    icon: ImageVector,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier.size(32.dp),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(24.dp)
            )
        }
        Spacer(modifier = Modifier.width(12.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = title,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                text = description,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                lineHeight = 14.sp
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Switch(
            checked = checked,
            onCheckedChange = onCheckedChange,
            colors = SwitchDefaults.colors(checkedTrackColor = MaterialTheme.colorScheme.primary)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun SettingsScreenPreview() {
    P7ModernUiTheme {
        // Preview dengan dummy data
        SettingsScreen(
            uiState = AuthUiState(name = "Preview User", isBiometricEnabled = true)
        )
    }
}
