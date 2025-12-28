.class public final Lx2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw2/f;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:I

.field public final d:Lx2/i;


# direct methods
.method public constructor <init>(Ljava/lang/String;IILx2/i;)V
    .locals 1

    const-string v0, "input"

    invoke-static {p1, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx2/b;->a:Ljava/lang/String;

    iput p2, p0, Lx2/b;->b:I

    iput p3, p0, Lx2/b;->c:I

    iput-object p4, p0, Lx2/b;->d:Lx2/i;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lx2/a;

    invoke-direct {v0, p0}, Lx2/a;-><init>(Lx2/b;)V

    return-object v0
.end method
