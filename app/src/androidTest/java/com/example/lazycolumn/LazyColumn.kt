import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ContactList() {
    LazyColumn(modifier = Modifier.padding(all = 20.dp)) {
        item {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 30.dp),
                contentAlignment = Alignment.Center
            )
            {
                Text(
                    text = "My Contacts",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 35.sp
                )
            }

            Spacer(modifier = Modifier.size(15.dp))

            Row {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "MailOutline",
                    modifier = Modifier.size(50.dp)
                )
                Spacer(modifier = Modifier.padding(17.dp))
                Column {
                    Text(
                        text = "Sana Javaid",
                        fontSize = 25.sp, fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "03114484463", fontSize = 15.sp,
                        modifier = Modifier.padding(top = 5.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.padding(top = 30.dp))

            Row {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "MailOutline",
                    modifier = Modifier.size(50.dp)
                )
                Spacer(modifier = Modifier.padding(17.dp))
                Column {
                    Text(
                        text = "Memoona BiBi",
                        fontSize = 25.sp, fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "03090008399", fontSize = 15.sp,
                        modifier = Modifier.padding(top = 5.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.padding(top = 30.dp))

            Row {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "MailOutline",
                    modifier = Modifier.size(50.dp)
                )
                Spacer(modifier = Modifier.padding(17.dp))
                Column {
                    Text(
                        text = "Sir Masab Ejaz",
                        fontSize = 25.sp, fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "03110462772", fontSize = 15.sp,
                        modifier = Modifier.padding(top = 5.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.padding(top = 30.dp))

            Row {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "MailOutline",
                    modifier = Modifier.size(50.dp)
                )
                Spacer(modifier = Modifier.padding(17.dp))
                Column {
                    Text(
                        text = "Laiba Aosaf",
                        fontSize = 25.sp, fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "03346042080", fontSize = 15.sp,
                        modifier = Modifier.padding(top = 5.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.padding(top = 30.dp))

            Row {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "MailOutline",
                    modifier = Modifier.size(50.dp)
                )
                Spacer(modifier = Modifier.padding(17.dp))
                Column {
                    Text(
                        text = "Shanzy Khan",
                        fontSize = 25.sp, fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "03166449310", fontSize = 15.sp,
                        modifier = Modifier.padding(top = 5.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.padding(top = 30.dp))

            Row {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "MailOutline",
                    modifier = Modifier.size(50.dp)
                )
                Spacer(modifier = Modifier.padding(17.dp))
                Column {
                    Text(
                        text = "Khadija Malik",
                        fontSize = 25.sp, fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "03346056606", fontSize = 15.sp,
                        modifier = Modifier.padding(top = 5.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.padding(top = 30.dp))

            Row {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "MailOutline",
                    modifier = Modifier.size(50.dp)
                )
                Spacer(modifier = Modifier.padding(17.dp))
                Column {
                    Text(
                        text = "Nimra Arshad",
                        fontSize = 25.sp, fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "03072625625", fontSize = 15.sp,
                        modifier = Modifier.padding(top = 5.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.padding(top = 30.dp))

            Row {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "MailOutline",
                    modifier = Modifier.size(50.dp)
                )
                Spacer(modifier = Modifier.padding(17.dp))
                Column {
                    Text(
                        text = "Warisha",
                        fontSize = 25.sp, fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "03174820016", fontSize = 17.sp,
                        modifier = Modifier.padding(top = 5.dp)
                    )
                }
            }


        }
    }

}