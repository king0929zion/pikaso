.class public final Ln0/S;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LP/k;

.field public b:I

.field public c:LF/d;

.field public d:LF/d;

.field public e:Z

.field public final synthetic f:LD/s;


# direct methods
.method public constructor <init>(LD/s;LP/k;ILF/d;LF/d;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/S;->f:LD/s;

    iput-object p2, p0, Ln0/S;->a:LP/k;

    iput p3, p0, Ln0/S;->b:I

    iput-object p4, p0, Ln0/S;->c:LF/d;

    iput-object p5, p0, Ln0/S;->d:LF/d;

    iput-boolean p6, p0, Ln0/S;->e:Z

    return-void
.end method


# virtual methods
.method public final a(II)Z
    .locals 2

    iget-object v0, p0, Ln0/S;->c:LF/d;

    iget v1, p0, Ln0/S;->b:I

    add-int/2addr p1, v1

    iget-object v0, v0, LF/d;->d:[Ljava/lang/Object;

    aget-object p1, v0, p1

    check-cast p1, LP/j;

    iget-object v0, p0, Ln0/S;->d:LF/d;

    add-int/2addr v1, p2

    iget-object p2, v0, LF/d;->d:[Ljava/lang/Object;

    aget-object p2, p2, v1

    check-cast p2, LP/j;

    sget-object v0, Ln0/U;->a:Ln0/T;

    invoke-static {p1, p2}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    if-ne p1, p2, :cond_1

    :goto_0
    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method
