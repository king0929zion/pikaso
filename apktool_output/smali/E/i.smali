.class public final LE/i;
.super LE/y;
.source "SourceFile"


# static fields
.field public static final c:LE/i;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LE/i;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-direct {v0, v1, v1, v2}, LE/y;-><init>(III)V

    sput-object v0, LE/i;->c:LE/i;

    return-void
.end method


# virtual methods
.method public final a(LE/z;LB0/a;LD/D0;LD/s;)V
    .locals 0

    const-string p1, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>"

    invoke-static {p2, p1}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    iget p1, p3, LD/D0;->u:I

    if-gez p1, :cond_0

    iget p4, p3, LD/D0;->t:I

    if-gtz p4, :cond_1

    :cond_0
    if-nez p1, :cond_2

    :cond_1
    invoke-virtual {p3}, LD/D0;->i()V

    return-void

    :cond_2
    invoke-virtual {p3}, LD/D0;->B()V

    iget p1, p3, LD/D0;->u:I

    iget-object p4, p3, LD/D0;->b:[I

    invoke-virtual {p3, p1}, LD/D0;->p(I)I

    move-result p1

    invoke-static {p4, p1}, LD/d;->j([II)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p2}, LB0/a;->M()V

    :cond_3
    invoke-virtual {p3}, LD/D0;->i()V

    goto :goto_0
.end method
