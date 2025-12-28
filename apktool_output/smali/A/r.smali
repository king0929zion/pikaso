.class public final LA/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/x;


# static fields
.field public static final a:LA/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LA/r;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LA/r;->a:LA/r;

    return-void
.end method


# virtual methods
.method public final a(LD/n;)J
    .locals 3

    const v0, -0x6df157d1

    invoke-virtual {p1, v0}, LD/n;->N(I)V

    sget-object v0, LA/s;->a:LD/H;

    invoke-virtual {p1, v0}, LD/n;->k(LD/k0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LW/r;

    iget-wide v0, v0, LW/r;->a:J

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, LD/n;->q(Z)V

    return-wide v0
.end method

.method public final b(LD/n;)Lz/h;
    .locals 2

    const v0, -0x1157ee36

    invoke-virtual {p1, v0}, LD/n;->N(I)V

    sget-object v0, LA/C;->a:Lz/h;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, LD/n;->q(Z)V

    return-object v0
.end method
