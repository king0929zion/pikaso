.class public final Lo1/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:LX1/e;


# instance fields
.field public final a:Lo1/h;

.field public b:I

.field public final c:Lo1/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LX1/e;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, LX1/e;-><init>(I)V

    sput-object v0, Lo1/r;->d:LX1/e;

    return-void
.end method

.method public constructor <init>(Lo1/h;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lo1/r;->b:I

    new-instance v0, Lo1/d;

    invoke-direct {v0}, Lo1/d;-><init>()V

    iput-object v0, p0, Lo1/r;->c:Lo1/d;

    iput-object p1, p0, Lo1/r;->a:Lo1/h;

    return-void
.end method
