.class public final LE/k;
.super LE/y;
.source "SourceFile"


# static fields
.field public static final c:LE/k;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LE/k;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-direct {v0, v1, v1, v2}, LE/y;-><init>(III)V

    sput-object v0, LE/k;->c:LE/k;

    return-void
.end method


# virtual methods
.method public final a(LE/z;LB0/a;LD/D0;LD/s;)V
    .locals 0

    const/4 p1, 0x0

    invoke-virtual {p3, p1}, LD/D0;->k(I)V

    return-void
.end method
