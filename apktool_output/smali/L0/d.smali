.class public final LL0/d;
.super LL0/c;
.source "SourceFile"


# direct methods
.method public constructor <init>(LD1/w;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LL0/c;->a:LL0/j;

    const/4 v0, 0x0

    iput v0, p0, LL0/c;->b:F

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LL0/c;->c:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-boolean v0, p0, LL0/c;->e:Z

    new-instance v0, LL0/k;

    invoke-direct {v0, p0, p1}, LL0/k;-><init>(LL0/d;LD1/w;)V

    iput-object v0, p0, LL0/c;->d:LL0/b;

    return-void
.end method
