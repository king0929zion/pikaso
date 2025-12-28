.class public final LD/H;
.super LD/k0;
.source "SourceFile"


# instance fields
.field public final b:LD/H0;


# direct methods
.method public constructor <init>(LD/H0;Lo2/a;)V
    .locals 0

    invoke-direct {p0, p2}, LD/k0;-><init>(Lo2/a;)V

    iput-object p1, p0, LD/H;->b:LD/H0;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)LD/l0;
    .locals 7

    new-instance v6, LD/l0;

    if-nez p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    move v3, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    const/4 v5, 0x1

    iget-object v4, p0, LD/H;->b:LD/H0;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, LD/l0;-><init>(LD/k0;Ljava/lang/Object;ZLD/H0;Z)V

    return-object v6
.end method
