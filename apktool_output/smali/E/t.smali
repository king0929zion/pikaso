.class public final LE/t;
.super LE/y;
.source "SourceFile"


# static fields
.field public static final c:LE/t;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LE/t;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-direct {v0, v1, v1, v2}, LE/y;-><init>(III)V

    sput-object v0, LE/t;->c:LE/t;

    return-void
.end method


# virtual methods
.method public final a(LE/z;LB0/a;LD/D0;LD/s;)V
    .locals 0

    iget p1, p3, LD/D0;->n:I

    if-nez p1, :cond_0

    invoke-virtual {p3}, LD/D0;->x()V

    const/4 p1, 0x0

    iput p1, p3, LD/D0;->s:I

    invoke-virtual {p3}, LD/D0;->m()I

    move-result p2

    iget p4, p3, LD/D0;->h:I

    sub-int/2addr p2, p4

    iput p2, p3, LD/D0;->t:I

    iput p1, p3, LD/D0;->i:I

    iput p1, p3, LD/D0;->j:I

    iput p1, p3, LD/D0;->o:I

    return-void

    :cond_0
    const-string p1, "Cannot reset when inserting"

    invoke-static {p1}, LD/d;->r(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method
